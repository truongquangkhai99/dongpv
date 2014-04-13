package vn.dongpv.pde.refactoring.change.creator.core;

/**
 * All identification of change creators.
 * 
 * @author Pham Van Dong
 * 
 * @see ChangeCreatorType
 * 
 */
public enum ChangeCreatorType
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
