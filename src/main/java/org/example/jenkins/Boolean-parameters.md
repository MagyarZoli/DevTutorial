Boolean Parameter
Name: RUN_TESTS
Description: Check this box if you want to run tests.
```bash
#!/bin/bash
echo "RUN_TESTS = $RUN_TESTS"
if [ "$RUN_TESTS" = "true" ];
then
	echo "RUNNING TESTS!";
else 
	echo "No tests will be run...";
fi
```