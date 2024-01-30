In this Project ,I simply create two registry like student And college both are eureka client
creted service registry as perform a Eureka server for register both service (Student and College) there.
and another app


Student service Run on port (url) --------> http://localhost:8080/swagger-ui/index.html#/student-controller/getStudentForColleg
Student service with api gateway ---------> http://localhost:8765/STUDENTSERVICE/swagger-ui/index.html#/student-controller/getStudentForColleg

college service Run on port (url)---------> http://localhost:8090/swagger-ui/index.html#/college-controller/createCollege
college service with api gateway ---------> http://localhost:8765/COLLEGESERVICE/swagger-ui/index.html#/college-controller/createCollege

api-gateway port : 8765

Service Regestry url is ------------------> http://localhost:8761/
