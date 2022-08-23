# SLF4J logging levels example

Build by `./gradlew build`

Get different output by running with different levels:

* Empty output (because of no warnings and errors)  
  ```java -Dorg.slf4j.simpleLogger.defaultLogLevel=WARN --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```
* Simple output (this is default)  
  ```java --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```

  or, the same  
  ```java -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```
* Detailed output  
  ```java -Dorg.slf4j.simpleLogger.defaultLogLevel=DEBUG --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```
* More detailed output  
  ```java -Dorg.slf4j.simpleLogger.defaultLogLevel=TRACE --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```
* Only some details  
  ```java -Dorg.slf4j.simpleLogger.defaultLogLevel=WARN -Dorg.slf4j.simpleLogger.log.org.logging.demo.MainKt=TRACE --add-opens=java.base/java.nio=ALL-UNNAMED  -jar build/libs/testLoggingLevels-1.0-SNAPSHOT.jar```
