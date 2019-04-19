package com.furlenco.blog.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;



import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;



public class SignInModel {


    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

}
