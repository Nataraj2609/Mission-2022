JWT added - Dependencies: web, security &

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>

1. Generating JWT
2. Validating JWT

Create packages

	controller
	service
	model
	config

Define secret key in application.properties like jwt.secret=natarajplacedinproductcompany

Create jwtTokenUtils inside config which will create & validate jwt Token

Create JWTUserDetailsService - implements the Spring Security UserDetailsService interface

Create JwtAuthenticationController - 

Create model - JwtRequest, JwtResponse

	JwtRequestFilter - add this class in config -extends the Spring Web Filter OncePerRequestFilter class

JwtAuthenticationEntryPoint - extend Spring's AuthenticationEntryPoint class and override its method commence

	

