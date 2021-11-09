visible after startup:
http://localhost:8080/actuator/metrics/resilience4j.bulkhead.max.thread.pool.size?tag=name:store-two

not visible after startup:
http://localhost:8080/actuator/metrics/resilience4j.bulkhead.max.thread.pool.size?tag=name:store-one

uncomment to see metric for this CB:
resilience4j.thread-pool-bulkhead.instances.store-one.coreThreadPoolSize=8
