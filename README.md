# Run each microservice in the following manner:
1. Run Service Registry
2. Run Config Server
3. Run Product Service
4. Run Order Service
5. Run Payment Service

# Set up zipkin:
### The quickest start is to run the latest image directly for zipkin
docker run -d -p 9411:9411 openzipkin/zipkin
baseUrl: http://localhost:9411

# Swagger-UI:

## PRODUCT-SERVICE:

<img width="1434" alt="Screenshot 2024-06-04 at 1 30 55 AM" src="https://github.com/anshita2907/spring-boot-microservice/assets/89690825/0030a4c8-7e72-4dbf-a08d-59f2e959edf1">

## PAYMENT-SERVICE:

<img width="1440" alt="Screenshot 2024-06-04 at 1 32 00 AM" src="https://github.com/anshita2907/spring-boot-microservice/assets/89690825/b8b57e62-7008-4e9f-b21a-da6f7d9ca704">
 
## ORDER-SERVICE:

<img width="1438" alt="Screenshot 2024-06-04 at 1 31 24 AM" src="https://github.com/anshita2907/spring-boot-microservice/assets/89690825/1a881688-e08a-4f74-b64d-b31151f4a409">

## API-GATEWAY:

<img width="1439" alt="Screenshot 2024-06-04 at 2 07 20 AM" src="https://github.com/anshita2907/spring-boot-microservice/assets/89690825/3bbe05b4-fc40-47c2-a24f-ad7e92a55ed6">


# ZIPKIN (Distributed Tracing System):

![image](https://github.com/anshita2907/spring-boot-microservice/assets/89690825/444db5b2-e053-4a35-8c7a-f18fcab4b66f)

![image](https://github.com/anshita2907/spring-boot-microservice/assets/89690825/f9d50e68-0e4c-40b0-be5e-2bf26e0cbfb0)

![image](https://github.com/anshita2907/spring-boot-microservice/assets/89690825/daae5f8b-a2ab-4dca-82c6-e781f5070435)


# SERVICE-REGISTRY:

<img width="1440" alt="Screenshot 2024-06-04 at 1 39 40 AM" src="https://github.com/anshita2907/spring-boot-microservice/assets/89690825/4c2c750b-516a-4697-b01c-2d53b730bfae">
