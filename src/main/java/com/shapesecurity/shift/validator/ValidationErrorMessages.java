package com.shapesecurity.shift.validator;

public interface ValidationErrorMessages {
    String VALID_BINDING_IDENTIFIER_NAME = "The name field of BindingIdentifier must be a valid identifier name";
    String VALID_BREAK_STATEMENT_LABEL = "The label field of BreakStatement exists and must be a valid identifier name";
    String CATCH_CLAUSE_BINDING_NOT_MEMBER_EXPRESSION = "The binding field of CatchClause must not be a MemberExpression";
    String VALID_CONTINUE_STATEMENT_LABEL = "The label field of ContinueStatement exists and must be a valid identifier name";
    String VALID_DIRECTIVE = "The raw value field of Directive must either be an empty string, or match the ES6 grammar production DoubleStringCharacter or SingleStringCharacter";
    String VALID_EXPORT_SPECIFIER_NAME = "The name field of ExportSpecifier exists and must be a valid identifier name";
    String VALID_EXPORTED_NAME = "The exported name field of ExportSpecifier must be a valid identifier name";
    String ONE_VARIABLE_DECLARATOR_IN_FOR_IN = "VariableDeclaration in ForInStatement can only have one VariableDeclarator";
    String NO_INIT_IN_VARIABLE_DECLARATOR_IN_FOR_IN = "The VariableDeclarator in ForInStatement should not have an initializer";
    String ONE_VARIABLE_DECLARATOR_IN_FOR_OF = "VariableDeclaration in ForOfStatement can only have one VariableDeclarator";
    String NO_INIT_IN_VARIABLE_DECLARATOR_IN_FOR_OF = "The VariableDeclarator in ForOfStatement should not have an initializer";
    String FORMAL_PARAMETER_ITEMS_NOT_MEMBER_EXPRESSION = "The items field of FormalParameters must not be a MemberExpression";
    String FORMAL_PARAMETER_ITEMS_BINDING_NOT_MEMBER_EXPRESSION = "binding field of the items field of FormalParameters must not be a MemberExpression";
    String VALID_IDENTIFIER_NAME = "The name field of IdentifierExpression must be a valid identifier name";
    String VALID_IF_STATEMENT = "IfStatement with null 'alternate' must not be the 'consequent' of an IfStatement with a non-null 'alternate'";
    String VALID_IMPORT_SPECIFIER_NAME = "The name field of ImportSpecifier exists and must be a valid identifier name";
    String VALID_LABEL = "The label field of LabeledStatement must be a valid identifier name";
    String LITERAL_NUMERIC_VALUE_NOT_NAN = "The value field of LiteralNumericExpression must not be NaN";
    String LITERAL_NUMERIC_VALUE_NOT_NEGATIVE = "The value field of LiteralNumericExpression must be non-negative";
    String LITERAL_NUMERIC_VALUE_NOT_INFINITE = "The value field of LiteralNumericExpression must be finite";
    String VALID_REG_EX_PATTERN = "pattern field of LiteralRegExpExpression must match the ES6 grammar production Pattern (21.2.1)";
    String VALID_REG_EX_FLAG = "flags field of LiteralRegExpExpression must not contain characters other than 'g', 'i', 'm', 'u', or 'y'";
    String NO_DUPLICATE_REG_EX_FLAG = "flags field of LiteralRegExpExpression must not contain duplicate flag characters";
    String RETURN_STATEMENT_IN_FUNCTION_BODY = "ReturnStatement must be within a FunctionBody";
    String BINDING_IDENTIFIERS_CALLED_DEFAULT = "BindingIdentifier may only be called \"*default*\" within a FunctionDeclaration or ClassDeclaration";
    String VALID_YIELD_EXPRESSION_POSITION = "YieldExpression is only allowed within FunctionDeclaration or FunctionExpression that are generators";
    String VALID_YIELD_GENERATOR_EXPRESSION_POSITION = "YieldGeneratorExpressions is only allowed within FunctionDeclaration or FunctionExpression that are generators";
    String SETTER_PARAM_NOT_MEMBER_EXPRESSION = "The param field of Setter must not be a MemberExpression";
    String SETTER_PARAM_BINDING_NOT_MEMBER_EXPRESSION = "The binding field of the param field of Setter must not be a MemberExpression";
    String VALID_SHORTHAND_PROPERTY_NAME = "The name field of ShorthandProperty must be a valid identifier name";
    String VALID_STATIC_MEMBER_EXPRESSION_PROPERTY_NAME = "The property field of StaticMemberExpression must be a valid identifier name";
    String VALID_TEMPLATE_ELEMENT_VALUE = "The raw value field of TemplateElement must match the ES6 grammar production TemplateCharacters";
    String ALTERNATING_TEMPLATE_EXPRESSION_ELEMENTS = "The elements field of TemplateExpression must be an alternating list of TemplateElement and Expression, starting and ending with a TemplateElement";
    String NOT_EMPTY_VARIABLE_DECLARATORS_LIST = "The declarators field in VariableDeclaration must not be an empty list";
    String CONST_VARIABLE_DECLARATION_MUST_HAVE_INIT = "VariableDeclarationStatements with a VariableDeclaration of kind CONST cannot have a VariableDeclarator with no initializer";
    String VARIABLE_DECLARATION_BINDING_NOT_MEMBER_EXPRESSION = "The binding field of VariableDeclarator must not be a MemberExpression";
}
