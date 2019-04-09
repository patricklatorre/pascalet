package gen;// Generated from C:/Users/ptrck/Github/pascalet/src\Pascalet.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascaletParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascaletVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascaletParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascaletParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(PascaletParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(PascaletParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(PascaletParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(PascaletParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(PascaletParser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(PascaletParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(PascaletParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(PascaletParser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(PascaletParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(PascaletParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(PascaletParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascaletParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(PascaletParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascaletParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(PascaletParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(PascaletParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(PascaletParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(PascaletParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(PascaletParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascaletParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(PascaletParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(PascaletParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascaletParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(PascaletParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(PascaletParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PascaletParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(PascaletParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(PascaletParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(PascaletParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(PascaletParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascaletParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascaletParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascaletParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(PascaletParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(PascaletParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(PascaletParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascaletParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascaletParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascaletParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascaletParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascaletParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascaletParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascaletParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(PascaletParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascaletParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascaletParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(PascaletParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PascaletParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PascaletParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PascaletParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascaletParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(PascaletParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascaletParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PascaletParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascaletParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascaletParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(PascaletParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascaletParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(PascaletParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascaletParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(PascaletParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(PascaletParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascaletParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascaletParser.FactorContext ctx);
}