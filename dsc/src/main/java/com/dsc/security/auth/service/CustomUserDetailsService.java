package com.dsc.security.auth.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;
import com.dsc.security.auth.repositories.RegisterCompnayRepository;
import com.dsc.security.auth.repositories.RolesRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private RegisterCompnayRepository regComRepo;

	@Autowired
	private RolesRepository roleRepo;

	public RegisterCompany findByEmail(String email) {
		return regComRepo.findByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		RegisterCompany findByEmail = regComRepo.findByEmail(email);
		
//		List<Role> userRoles = roleRepo.findAll();
//		userRoles.forEach(System.out::println);

		if (findByEmail != null) {
			List<GrantedAuthority> authorities = getUserAuthority(findByEmail.getRoles());
//			List<GrantedAuthority> authorities = getUserAuthority((Set<Role>) findAll);
			System.out.println("Authorities " + authorities);
			return getUserForDetails(findByEmail, authorities);

		} else {
			throw new UsernameNotFoundException("Company mail not found.");
		}

	}

	private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
		Set<GrantedAuthority> roles = new HashSet<>();
		userRoles.forEach((role) -> {
			roles.add(new SimpleGrantedAuthority(role.getRole()));
		});

		List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
		System.out.println("GrantedAuth" + grantedAuthorities);
		return grantedAuthorities;
	}

	@SuppressWarnings("unused")
	private UserDetails getUserForDetails(RegisterCompany reguser, List<GrantedAuthority> authorities) {
		return new User(reguser.getEmail(), reguser.getPassword(), authorities);
	}

}
