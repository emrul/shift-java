package com.shapesecurity.shift.es2018.test262.expectations;

abstract class Regexp {

	private Regexp() {

	}

	// Tests should parse but which have a feature flag we don't support, but which we parse anyway because we're too lax
	static final String[] xpass = new String[] {

			// tests using constructor
			"built-ins/RegExp/named-groups/string-replace-get.js",
			"built-ins/RegExp/named-groups/groups-object-subclass-sans.js",
			"built-ins/RegExp/named-groups/string-replace-undefined.js",
			"built-ins/RegExp/named-groups/string-replace-nocaptures.js",
			"built-ins/RegExp/named-groups/groups-object-subclass.js",
			"built-ins/RegExp/named-groups/string-replace-missing.js",
			"built-ins/RegExp/named-groups/string-replace-numbered.js",
			"built-ins/RegExp/named-groups/groups-object-undefined.js",
			"built-ins/RegExp/named-groups/string-replace-escaped.js",
			"built-ins/RegExp/named-groups/functional-replace-global.js",
			"built-ins/RegExp/named-groups/string-replace-unclosed.js",
			"built-ins/RegExp/named-groups/functional-replace-non-global.js",
			"built-ins/RegExp/prototype/dotAll/cross-realm.js",

			// tests using eval
			"language/literals/regexp/named-groups/invalid-lone-surrogate-groupname.js",

			// tests with (in es2016, but not in es2018) invalid escapes like `\p` or `\k`, and with the unicode flag set.
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Block-implicit.js",
			"built-ins/RegExp/property-escapes/grammar-extension-unopened-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-invalid.js",
			"built-ins/RegExp/property-escapes/loose-matching-09-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-circumflex-negation-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFD-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-no-braces-value.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-Script_Extensions-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-circumflex-negation.js",
			"built-ins/RegExp/property-escapes/loose-matching-10.js",
			"built-ins/RegExp/property-escapes/grammar-extension-unopened.js",
			"built-ins/RegExp/property-escapes/loose-matching-04-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Grapheme_Link.js",
			"built-ins/RegExp/property-escapes/loose-matching-04.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Grapheme_Extend.js",
			"built-ins/RegExp/property-escapes/grammar-extension-Is-prefix-Script.js",
			"built-ins/RegExp/property-escapes/grammar-extension-no-braces-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-14.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script_Extensions-equals-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Block-with-value-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-no-braces.js",
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Block-implicit-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-05.js",
			"built-ins/RegExp/property-escapes/loose-matching-01-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Composition_Exclusion-negated.js",
			"built-ins/RegExp/property-escapes/non-existent-property-existing-value-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Math.js",
			"built-ins/RegExp/property-escapes/unsupported-property-FC_NFKC_Closure.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Block-with-value.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator-and-value-only.js",
			"built-ins/RegExp/property-escapes/loose-matching-01.js",
			"built-ins/RegExp/property-escapes/character-class-range-end.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-Script_Extensions.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Uppercase.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-General_Category-equals.js",
			"built-ins/RegExp/property-escapes/character-class-range-no-dash-start.js",
			"built-ins/RegExp/property-escapes/loose-matching-10-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_T.js",
			"built-ins/RegExp/property-escapes/loose-matching-11.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Yes.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script-equals-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Script-implicit-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_T-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-no-braces-value-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-FC_NFKC_Closure.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_ID_Start-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Default_Ignorable_Code_Point.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Yes-negated.js",
			"built-ins/RegExp/property-escapes/non-existent-property-and-value.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Line_Break-with-value-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Y-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFKC.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Uppercase-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator-only-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-06-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Full_Composition_Exclusion-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Lowercase.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script_Extensions-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-invalid-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_ID_Continue.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Hyphen-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Invalid.js",
			"built-ins/RegExp/property-escapes/loose-matching-03-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-property-FC_NFKC_Closure-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Alphabetic-negated.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script_Extensions.js",
			"built-ins/RegExp/property-escapes/character-class-range-no-dash-end.js",
			"built-ins/RegExp/property-escapes/non-existent-property-existing-value.js",
			"built-ins/RegExp/property-escapes/loose-matching-12-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFC-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_F.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_No.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-General_Category.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFC.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator-and-value-only-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_ID_Start.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-general-category.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_No-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFD.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Y.js",
			"built-ins/RegExp/property-escapes/grammar-extension-empty.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-FC_NFKC_Closure-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-08.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Grapheme_Link-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Script.js",
			"built-ins/RegExp/property-escapes/loose-matching-11-negated.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Full_Composition_Exclusion.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-General_Category-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-08-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-09.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-Script.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Line_Break-with-value.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFKD.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Prepended_Concatenation_Mark-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Composition_Exclusion.js",
			"built-ins/RegExp/property-escapes/loose-matching-14-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator-only.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Alphabetic.js",
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Script-implicit.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Lowercase-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFKD-negated.js",
			"built-ins/RegExp/property-escapes/character-class-range-start.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script-equals.js",
			"built-ins/RegExp/property-escapes/grammar-extension-In-prefix-Script-negated.js",
			"built-ins/RegExp/property-escapes/non-existent-property-and-value-negated.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-Script_Extensions-equals.js",
			"built-ins/RegExp/property-escapes/loose-matching-05-negated.js",
			"built-ins/RegExp/property-escapes/non-existent-binary-property.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Line_Break.js",
			"built-ins/RegExp/property-escapes/loose-matching-06.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Prepended_Concatenation_Mark.js",
			"built-ins/RegExp/property-escapes/grammar-extension-unclosed.js",
			"built-ins/RegExp/property-escapes/grammar-extension-unclosed-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-02-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Default_Ignorable_Code_Point-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_Invalid-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-02.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-General_Category-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Expands_On_NFKC-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-13-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-12.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_N-negated.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_N.js",
			"built-ins/RegExp/property-escapes/grammar-extension-Is-prefix-Script-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-03.js",
			"built-ins/RegExp/property-escapes/grammar-extension-separator-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Grapheme_Extend-negated.js",
			"built-ins/RegExp/property-escapes/non-binary-property-without-value-General_Category-equals-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-13.js",
			"built-ins/RegExp/property-escapes/non-existent-property-value-Script-negated.js",
			"built-ins/RegExp/property-escapes/non-existent-binary-property-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-07.js",
			"built-ins/RegExp/property-escapes/unsupported-property-Line_Break-negated.js",
			"built-ins/RegExp/property-escapes/grammar-extension-empty-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_Math-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Hyphen.js",
			"built-ins/RegExp/property-escapes/binary-property-with-value-ASCII_-_F-negated.js",
			"built-ins/RegExp/property-escapes/unsupported-binary-property-Other_ID_Continue-negated.js",
			"built-ins/RegExp/property-escapes/loose-matching-07-negated.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-without-group-2-u.js",
			"language/literals/regexp/named-groups/invalid-unterminated-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-4.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname.js",
			"language/literals/regexp/named-groups/invalid-numeric-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-5.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-continue-groupspecifier-4-u.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-4.js",
			"language/literals/regexp/named-groups/invalid-non-id-continue-groupspecifier-4.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-5.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-without-group-3-u.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-4-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-4.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname.js",
			"language/literals/regexp/named-groups/invalid-u-escape-in-groupspecifier-2.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-3-u.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-u.js",
			"language/literals/regexp/named-groups/invalid-numeric-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-2-u.js",
			"language/literals/regexp/named-groups/invalid-identity-escape-in-capture-u.js",
			"language/literals/regexp/named-groups/invalid-duplicate-groupspecifier-2.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-5.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-u.js",
			"language/literals/regexp/named-groups/invalid-duplicate-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-2.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-without-group-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-6.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-2-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-7.js",
			"language/literals/regexp/named-groups/invalid-punctuator-starting-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-duplicate-groupspecifier-2-u.js",
			"language/literals/regexp/named-groups/invalid-punctuator-within-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-3.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-8.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-2.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-3-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-4-u.js",
			"language/literals/regexp/named-groups/invalid-empty-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-punctuator-within-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-3.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-6.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-8-u.js",
			"language/literals/regexp/named-groups/invalid-unterminated-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-9-u.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-2.js",
			"language/literals/regexp/named-groups/invalid-empty-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-non-id-start-groupspecifier-5-u.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-3.js",
			"language/literals/regexp/named-groups/invalid-dangling-groupname-without-group-u.js",
			"language/literals/regexp/named-groups/invalid-incomplete-groupname-2-u.js",
			"language/literals/regexp/named-groups/invalid-punctuator-starting-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-u-escape-in-groupspecifier.js",
			"language/literals/regexp/named-groups/invalid-duplicate-groupspecifier-u.js",
			"language/literals/regexp/named-groups/invalid-non-id-continue-groupspecifier.js"
	};


	// Tests which are supposed to fail to parse, but which we parse anyway because we're too lax
	public static final String[] xfail = new String[] {

	};
}
