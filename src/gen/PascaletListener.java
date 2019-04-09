package gen;// Generated from C:/Users/ptrck/Github/pascalet/src\Pascalet.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascaletParser}.
 */
public interface PascaletListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascaletParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascaletParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(PascaletParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(PascaletParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PascaletParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PascaletParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(PascaletParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(PascaletParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(PascaletParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(PascaletParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(PascaletParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(PascaletParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(PascaletParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(PascaletParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PascaletParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PascaletParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PascaletParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PascaletParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascaletParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascaletParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascaletParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascaletParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(PascaletParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(PascaletParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascaletParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascaletParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PascaletParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PascaletParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(PascaletParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(PascaletParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PascaletParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PascaletParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PascaletParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PascaletParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascaletParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascaletParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascaletParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascaletParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PascaletParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PascaletParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PascaletParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PascaletParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PascaletParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PascaletParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascaletParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascaletParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(PascaletParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(PascaletParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(PascaletParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(PascaletParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(PascaletParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(PascaletParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(PascaletParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(PascaletParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascaletParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascaletParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascaletParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascaletParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(PascaletParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(PascaletParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascaletParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascaletParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PascaletParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PascaletParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascaletParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascaletParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascaletParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascaletParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascaletParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascaletParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascaletParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascaletParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascaletParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascaletParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascaletParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascaletParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascaletParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascaletParser.FactorContext ctx);
}