package com.itwill.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {

	private String m_id;
	private String m_password;
	private String m_name;
	private String m_phone;
	private String m_birth;
	private String m_email;
	private String m_gender;
	private Integer m_point;
	private String m_address;
	
}
