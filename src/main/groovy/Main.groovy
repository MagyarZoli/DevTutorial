class Main {

    static Person person = new Person();

    /**
     *
     * @param args
     */
    static void main(String[] args) {
        //basic()
        person.setFirstName("Zoltan")
        person.setLastName("Magyar")
        person.setAge(28)
        //person()
        //calculator()
        //closure()
        //collections()
        //fileReadHandler()
        //fileWriteHandler()
        serializingFileWriteHandler()
    }

    static void basic() {
        println "Hello world!"
        int age = 40
        println age
        println age.getClass()
        def name = "Zoli"
        println name
        println name.getClass()
    }

    static void person() {
        println person.getFullName()
        println person.getAge()

        if (person.getAge() >= 45 && person.getAge() <= 65) {
            println person.getFullName() + " is middle-aged"
        } else if (person.getAge() >= 1 && person.getAge() <= 18) {
            println person.getFullName() + " is teen"
        } else {
            println person.getFullName() + " is " + person.getAge() + " years old"
        }

        //List<Person> persons = [person, new Person(firstName: "Mary", lastName: "Hill", age: 40)]
        def persons = [person, new Person(firstName: "Mary", lastName: "Hill", age: 40)]
        for (Person p : persons) {
            println p.getFullName()
        }

        //person.getFirstName().toLong()
        try {
            person.getFirstName().toLong()
        } catch (NumberFormatException e) {
            assert e instanceof NumberFormatException
            println "Cannot convert a String into a Long"
        }

        println person.getFirstName().dropRight(2)
    }

    static void calculator() {
        Calculator calculator = new Calculator()
        //println calculator.add(5, 10)
        assert calculator.add(5, 10) == 15
        assert calculator.subtract(8, 2) == 6
        assert calculator.multiply(6, 5) == 30
        assert calculator.divide(10, 3) == 3.3_333_333f
        try {
            calculator.divide(7, 0)
        } catch (RuntimeException e) {
            println e.getMessage()
        }
    }

    static void closure() {
        Closure personToString = {
            println person.toString()
        }

        personToString()
        Closure personToString2 = {
            Person person2 -> println person2.toString()
        }
        personToString2(person)
        handlePerson(personToString, person)

        Closure personFullName = {
            Person person2 -> println person2.firstName + " " + person2.lastName
        }
        handlePerson(personFullName, person)
    }

    static void handlePerson(Closure c, Person p) {
        if (p == null) {
            throw new RuntimeException("A person instance cannot be null")
        }
    }

    static void collections() {
        Person johnDoe = new Person("John", "Doe", 48)
        Person maryHill = new Person("Mary", "Hill", 30)
        Person thomasMarks = new Person("Thomas", "Marks", 21)

        def allPersons = [johnDoe, maryHill, thomasMarks]

        assert allPersons instanceof List
        assert allPersons.size() == 3
        assert allPersons[2] == thomasMarks
        assert allPersons.get(2) == thomasMarks

        //Person it
        allPersons.each {
            println it
        }

        allPersons.eachWithIndex { Person entry, int i ->
            println i + ": " + entry
        }

        allPersons.find {it.lastName == "Hill"} == maryHill

        allPersons.collect {it.age <= 30} == [false, true, true]

        allPersons.sort {it.age} == [thomasMarks, maryHill, johnDoe]
    }

    static void fileReadHandler() {
        Person person1 = new Person()
        File file = new File("src/main/resources/john-doe.txt")
        println file.getText("UTF-8")
        file.eachLine {String it, Integer no ->
            if (no == 1) {
                person1.setFirstName(it)
            } else if (no == 2) {
                person1.setLastName(it)
            } else if (no == 3) {
                try {
                    person1.setAge(it.toInteger())
                } catch (NumberFormatException e) {
                    person1.setAge(0)
                }
            } else {
                throw new RuntimeException("A person text file should only have 3 line")
            }
        }
        println person1
    }

    static void fileWriteHandler() {
        File file = new File("src/main/resources/mary-hill.txt")
        file.withWriter("UTF-8") {
            it.writeLine("Mary")
            it.writeLine("Hill")
            it.writeLine("30")
        }
        file.append("1")
        file << "2"
    }

    static void serializingFileWriteHandler() {
        Person person1 = new Person("Thomas", "Marks", 20)
        File file = new File("src/main/resources/thomas-marks.bin")
        file.withObjectOutputStream {
            it.writeObject(person1)
        }
    }
}