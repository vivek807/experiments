package com.vivek.references;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParseLongExample {
private static final Logger logger = LoggerFactory.getLogger(ParseLongExample.class);

	public static void main(String[] args) {
		String str = "1234";
		
		logger.info("'{}' - '{}'", str, Long.parseLong(str));
		
		str = " 12344 ";
		logger.info("'{}' - '{}'", str, Long.parseLong(str.trim()));
		logger.info("'{}' - '{}'", str, Long.parseLong(str));
	}
}
