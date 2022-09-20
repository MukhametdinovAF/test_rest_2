package ru.mukhametdinov.test_rest_2.service;

import ru.mukhametdinov.test_rest_2.model.Response;

public class ModifyUid implements MyService{

    @Override
    public Response execute(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
