interface Todo {
    id: number;
    title: string;
    status: TodoEnum,
    completedOn?: Date;
}

enum TodoEnum {
    DONE = "done",
    IN_PROGRESS = "in-progress",
    TODO = "todo"
}

// const todoItems = [
//     { id: 1, title: "Learn HTML", status: "done", completedOn: new Date("2021-09-11") },
//     { id: 2, title: "Learn TypeScript", status: "in-progress" },
//     { id: 3, title: "Write the best app in the world", status: "todo" },
// ];
const todoItems:Todo[] = [
    { id: 1, title: "Learn HTML", status: TodoEnum.TODO, completedOn: new Date("2021-09-11") },
    { id: 2, title: "Learn TypeScript", status: TodoEnum.IN_PROGRESS },
    { id: 3, title: "Write the best app in the world", status: TodoEnum.TODO },
];

function addTodoItem(todo: string): Todo {
    const id = getNextId(todoItems);

    // const newTodo = {
    //     id,
    //     title: todo,
    //     status: "todo",
    // }
    const newTodo: Todo = {
        id,
        title: todo,
        status: TodoEnum.TODO,
    }

    todoItems.push(newTodo);

    return newTodo;
}

// function getNextId(items) {
//     return items.reduce((max, x) => x.id > max ? x.id : max, 0) + 1;
// }
// function getNextId<T extends { id: number }>(items: T[]): number {
//     return items.reduce((max, x) => x.id > max ? x.id : max, 0) + 1;
// }
function getNextId<T extends Todo>(items: T[]): number {
    return items.reduce((max, x) => x.id > max ? x.id : max, 0) + 1;
}

const newTodo = addTodoItem("Buy lots of stuff with all the money we make from the app");

console.log(JSON.stringify(newTodo));