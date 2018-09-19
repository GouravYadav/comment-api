package com.target.product.comment.swagger;

import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
		info = @Info(
				description = "Moderate Comments on products",
				version = "V1.0",
				title = "Comment API",
				contact = @Contact(
						name = "Gourav Yadav",
						email = "gourav@gmail.com",
						url = "http://www.iamgourav.com"),
				license = @License(
						name = "",
						url = "")
				),
		consumes = {"application/json"},
		produces = {"application/json"},
		schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}
		)
public interface ApiDocumentationConfig {

}
