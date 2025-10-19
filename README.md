Feign client implementation for interaction between two microservices.
Add OpenFeign starter in the project and annotate main class with @EnableFeignClients.
It provides the consumer with and Interface through which the consumer can just declare that interface with @FeignCient and methods declarations with the Http mapping of the producer microservice request.
Advantage here is that developer does not have to manually write all the code, it provides built in support for that.
It internally uses LBC client to fetch producer instance with less load factor. 
