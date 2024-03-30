package com.iben.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="JobListing" )
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Post {
    
   private String  desc;
   private int exp;
   private String profile;
   private String  techs [];
 
}
