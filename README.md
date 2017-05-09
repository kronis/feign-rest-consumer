# Template application

To run locally:
```
$ ../gradlew bootRun
```

```
$ docker run -d -p 8080:8080 --name feignconsumer tinetrm.azurecr.io/feign-rest-consumer:latest
```

http://localhost:8082/my-dummy-api/get-greeting/asa2

http://localhost:8082/my-dummy-api/hystrix

http://localhost:8082/my-dummy-api/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8082%2Fmy-dummy-api%2Fhystrix.stream



