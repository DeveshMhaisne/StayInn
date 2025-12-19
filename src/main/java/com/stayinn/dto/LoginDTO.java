package com.stayinn.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginDTO {

		@NotBlank(message = "email is required")
		@Email(message = "Email is invalid")
		public String email;
		
		@NotBlank(message = "password is required")
		public String password;
}
