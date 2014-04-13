package vn.dongpv.pde.rule.analyzer.core;

/**
 * All identification of rules.
 * 
 * @author Pham Van Dong
 * 
 * @see RuleDescriptor
 * @see RuleAnalyzer
 * 
 */
public enum RuleType
{

	Null,
	FinalVariable,
	UseStringLengthCompareEmptyString,
	AvoidUsingMathClassMethodsOnConstant,
	AvoidConstructingPrimitiveType,
	ShouldBeStaticInnerClass,
	FieldShouldBeStatic,
	UncalledPrivateMethod,
	UnusedVariable,
	BoxedPrimitiveJustCallToString,
	ConstantExpression,
	AvoidConcatenatingStringUsingPlusOperatorInLoop,
	UseEntrySetInsteadOfKeySet,
	AvoidCreatingThreadWithoutRunMethod,
	AvoidUnnecessarySubstring,
	UseSingleQuotesWhenConcatenatingCharacterToString,
	AvoidEmptyLoops,
	AvoidSynchronizedBlocksInLoop,
	AvoidVectorElementAtInsideLoop,
	AvoidPollingLoops,
	AvoidSynchronizedMethodsInLoop,
	AvoidObjectInstantiationInLoops,
	PlaceTryCatchOutOfLoop,
	AlwaysReuseImmutableConstantObjectsForBetterMemoryUtilization,
	EnsureEfficientRemovalOfElementsInCollection,
	EnsureEfficientRemovalOfMapEntries,
	EnsureEfficientIterationOverMapEntries,
	AvoidEmptyIf,
	AvoidEmptyStaticInitializer,
	AvoidSynchronizedModifierInMethod,
	AvoidWriteByteMethodInLoop,
	AvoidBooleanArray,
	AvoidUsingStringTokenizer,
	AvoidInstantiationForGetClass,
	UseStringEqualsIgnoreCase,
	AvoidEmptyTryBlocks,
	UseToArrayWithArrayAsParameter,
	AvoidUsingThreadYield,
	AvoidReadByteMethodInLoop,
	AvoidLinkedList,
	AvoidEmptySynchronizedBlock,
	UseDataSourceInsteadOfDriverManager,
	AvoidUsingStringCharAt,
	AvoidEmptyFinallyBlock,
	AvoidEmptyCatchBlocks,
	UseTransientKeyword,
	DefineInitialCapacities,
	UseShiftOperators,
	UsePreparedStatementInsteadOfStatement,
	AvoidMethodCallsInLoop,
	UseShortCircuitBooleanOperators,
	FieldShouldBePrivate,
	NonFinalPublicStaticField,
	ConstructorShouldCallPrivateOrFinalMethod,
	DontUseInnerClass,
	UncloneableClass,
	UnserializeableClass,
	UndeserializeableClass,
	DoNotImplementSerializable,
	AvoidPackageScope,
	DoNotSubclassClassLoader,
	AvoidUsingRandom,
	FinalizeShouldNotBePublic,
	HardcodedPassword,
	UsePrivilegedCodeSparingly,
	AvoidUnnecessaryIf,
	FormatStringAttack,
	CommandInjection,

}
