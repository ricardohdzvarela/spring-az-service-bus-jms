# spring-az-service-bus

## build and run application
mvn clean spring-boot:run

## test application
### Topic
curl -X POST localhost:8080/messages?message=hello

### Queue
curl -X POST localhost:8080/queue?message=hello