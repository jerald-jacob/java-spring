/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsugitsugi.hotel.reserv.user.controller;


import com.tsugitsugi.hotel.reserv.user.exception.BadRequestException;
import com.tsugitsugi.hotel.reserv.user.util.LanguageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author jerald
 */


@RestController
@ApiIgnore
public class SecurityErrorController {
    @Autowired
    private LanguageUtil languageUtil;
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	@RequestMapping("/errors/400")
	   ResponseEntity error(RequestRejectedException e) {
              throw new BadRequestException(languageUtil.getTranslatedText("malformed.url", null));
	}
}
