package ru.mukhametdinov.test_rest_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mukhametdinov.test_rest_2.model.Request;
import ru.mukhametdinov.test_rest_2.model.Response;
import ru.mukhametdinov.test_rest_2.service.MyService;

@RestController
public class MyTestRestController {
//    private final MyService myService;
//    @Autowired
//    public MyTestRestController (MyService myService){
//        this.myService=myService;
//    }
@PostMapping(value = "/feed")
    public ResponseEntity<Response>feed(@RequestBody Request request){
    Response response = Response.builder()
            .uid(request.getUid())
//            .operationUid(request.getOperationUid())
//            .systemTime(request.getSystemTime())
            .code("success")
//            .errorCode("")
//            .errorMessage("")
            .build();
    if (response!=null) {
        System.out.println(request.getUid());
        System.out.println(response.getCode());
    }
//    Response afterModify = myService.execute(response);
    return new ResponseEntity<>(response, HttpStatus.OK);

}
}
