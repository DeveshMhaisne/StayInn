package com.stayinn.dto;

import java.time.LocalDateTime;

import com.stayinn.entities.Role;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor

public class UserResponseDTO {

	private Long id;
	private String email;
	private String name;
	private String mobile;
	private Role role;
	private boolean active;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public UserResponseDTO(Long id,String email,String name,String mobile,Role role,boolean active)
	{
		this.id = id;
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.role = role;
		this.active = active;
	}
}
