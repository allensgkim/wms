package com.brazil.cerp.controller.sample;

import com.brazil.cerp.domain.sample.SampleDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@Api(value="sample", description="Swagger Guide controller sample")
public class SampleController {

    @ApiOperation(value = "Sample Controller 테스트입니다.",response = SampleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/user", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> sampleDto(SampleDto sampleDto) {
        return new ResponseEntity<>(sampleDto, HttpStatus.OK);
    }
}
