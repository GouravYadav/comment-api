package com.target.product.comment.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ModerateCommentImpl implements ModerateComment {

	@Override
	public boolean isValid(String comment) {

		List<String> oddWords = Arrays.asList("ABC", "XYZ");

		String words[] = comment.split(" ");

		for (String word : words) {

			if (oddWords.contains(word.toUpperCase())) {
				return false;
			}
		}

		return true;
	}

}
