package com.moneyhub.web.domains;

import java.io.Serializable;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data @Component
public class AdminDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String astate,
	pos,
	aid,
	pwd;
}
