visible after startup:
http://localhost:8080/actuator/metrics/resilience4j.bulkhead.max.thread.pool.size?tag=name:store-two
http://localhost:8080/actuator/metrics/resilience4j.timelimiter.calls?tag=name:store-two

not visible after startup:
http://localhost:8080/actuator/metrics/resilience4j.bulkhead.max.thread.pool.size?tag=name:store-one
http://localhost:8080/actuator/metrics/resilience4j.timelimiter.calls?tag=name:store-one

uncomment to see metric for this CB:
1. resilience4j.thread-pool-bulkhead.instances.store-one.coreThreadPoolSize=8
2. resilience4j.timelimiter.instances.store-one.timeoutDuration=2s


