package vn.dongpv.pde.rule.checker;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ITypeBinding;

import vn.dongpv.pde.PluginConstants;
import vn.dongpv.pde.adt.CompositeParameter;
import vn.dongpv.pde.rule.checker.core.ConditionalChecker;
import vn.dongpv.pde.util.TypeUtil;
import vn.dongpv.pde.util.ValidatorUtil;

public class AvoidUsingStringTokenizerChecker extends ConditionalChecker
{

	private final ASTNode rootNode;
	private final ClassInstanceCreation creation;

	public AvoidUsingStringTokenizerChecker(CompositeParameter parameter)
		throws NullPointerException
	{
		super(parameter);

		rootNode = TypeUtil.cast(parameter.getParameter(PARSED_ROOT_NODE));
		creation = TypeUtil.cast(parameter.getParameter(PARSED_NODE));
	}

	@Override
	protected boolean checkParameters()
	{
		return ValidatorUtil.notNull(rootNode, creation);
	}

	@Override
	protected boolean checkDetails()
	{
		final ITypeBinding binding = creation.resolveTypeBinding();
		final String typeName = binding.getQualifiedName();

		return typeName.equalsIgnoreCase(PluginConstants.STRING_TOKENIZER_CLASS_NAME);
	}

	private final void readObject(java.io.ObjectInputStream in) throws java.io.IOException
	{
		throw new java.io.IOException("Class cannot be deserialized");
	}

}
