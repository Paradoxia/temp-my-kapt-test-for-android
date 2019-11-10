## Debugging Kapt

1. ```./gradlew daemon --stop```
2. ```./gradlew --no-daemon clean compileDebugKotlin -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket\,address=5005\,server=y\,suspend=n"```




1. Edit configurations
2. Press +
3. Select "Remote"
4. Leave default (Attach to Remote JVM, use module class path = <no module>) but add a name at the top


Error running 'test': Unable to open debugger port (localhost:5005): java.net.ConnectException "Connection refused (Connection refused)"

Retry until gradle task above allow you to start the debugger



From project root...

./gradlew --no-daemon clean compileDebugKotlin -Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket\,address=5005\,server=y\,suspend=y" <-- suspend=y will wait for debugger to attach, if suspend=n then you need to start debugger as soon as possible




What i need to copy methods?
https://github.com/root1991/Trembita/blob/master/trembita-processor/src/main/java/com/trembita/TrembitaProcessor.kt