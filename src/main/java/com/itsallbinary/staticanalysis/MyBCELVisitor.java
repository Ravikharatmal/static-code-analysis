package com.itsallbinary.staticanalysis;

import org.apache.bcel.classfile.AnnotationDefault;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.Annotations;
import org.apache.bcel.classfile.BootstrapMethods;
import org.apache.bcel.classfile.Code;
import org.apache.bcel.classfile.CodeException;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantDouble;
import org.apache.bcel.classfile.ConstantFieldref;
import org.apache.bcel.classfile.ConstantFloat;
import org.apache.bcel.classfile.ConstantInteger;
import org.apache.bcel.classfile.ConstantInterfaceMethodref;
import org.apache.bcel.classfile.ConstantInvokeDynamic;
import org.apache.bcel.classfile.ConstantLong;
import org.apache.bcel.classfile.ConstantMethodHandle;
import org.apache.bcel.classfile.ConstantMethodType;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantModule;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPackage;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.ConstantValue;
import org.apache.bcel.classfile.Deprecated;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.EnclosingMethod;
import org.apache.bcel.classfile.ExceptionTable;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.InnerClass;
import org.apache.bcel.classfile.InnerClasses;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LineNumber;
import org.apache.bcel.classfile.LineNumberTable;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.LocalVariableTable;
import org.apache.bcel.classfile.LocalVariableTypeTable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.MethodParameters;
import org.apache.bcel.classfile.ParameterAnnotationEntry;
import org.apache.bcel.classfile.ParameterAnnotations;
import org.apache.bcel.classfile.Signature;
import org.apache.bcel.classfile.SourceFile;
import org.apache.bcel.classfile.StackMap;
import org.apache.bcel.classfile.StackMapEntry;
import org.apache.bcel.classfile.Synthetic;
import org.apache.bcel.classfile.Unknown;

public class MyBCELVisitor extends EmptyVisitor {

	@Override
	public void visitCode(Code obj) {
		System.out.println("##### visitCode - " + obj);

	}

	@Override
	public void visitCodeException(CodeException obj) {
		System.out.println("##### visitCodeException - " + obj);

	}

	@Override
	public void visitConstantClass(ConstantClass obj) {
		System.out.println("##### visitConstantClass - " + obj);

	}

	@Override
	public void visitConstantDouble(ConstantDouble obj) {
		System.out.println("##### visitConstantDouble - " + obj);

	}

	@Override
	public void visitConstantFieldref(ConstantFieldref obj) {
		System.out.println("##### visitConstantFieldref - " + obj);

	}

	@Override
	public void visitConstantFloat(ConstantFloat obj) {
		System.out.println("##### visitConstantFloat - " + obj);

	}

	@Override
	public void visitConstantInteger(ConstantInteger obj) {
		System.out.println("##### visitConstantInteger - " + obj);

	}

	@Override
	public void visitConstantInterfaceMethodref(ConstantInterfaceMethodref obj) {
		System.out.println("##### visitConstantInterfaceMethodref - " + obj);

	}

	@Override
	public void visitConstantInvokeDynamic(ConstantInvokeDynamic obj) {
		System.out.println("##### visitConstantInvokeDynamic - " + obj);

	}

	@Override
	public void visitConstantLong(ConstantLong obj) {
		System.out.println("##### visitConstantLong - " + obj);

	}

	@Override
	public void visitConstantMethodref(ConstantMethodref obj) {
		System.out.println("##### visitConstantMethodref - " + obj);

	}

	@Override
	public void visitConstantNameAndType(ConstantNameAndType obj) {
		System.out.println("##### visitConstantNameAndType - " + obj);

	}

	@Override
	public void visitConstantPool(ConstantPool obj) {
		System.out.println("##### visitConstantPool - " + obj);

	}

	@Override
	public void visitConstantString(ConstantString obj) {
		System.out.println("##### visitConstantString - " + obj);

	}

	@Override
	public void visitConstantUtf8(ConstantUtf8 obj) {
		System.out.println("##### visitConstantUtf8 - " + obj);

	}

	@Override
	public void visitConstantValue(ConstantValue obj) {
		System.out.println("##### visitConstantValue - " + obj);

	}

	@Override
	public void visitDeprecated(Deprecated obj) {
		System.out.println("##### visitDeprecated - " + obj);

	}

	@Override
	public void visitExceptionTable(ExceptionTable obj) {
		System.out.println("##### visitExceptionTable - " + obj);

	}

	@Override
	public void visitField(Field obj) {
		System.out.println("##### visitField - " + obj);

	}

	@Override
	public void visitInnerClass(InnerClass obj) {
		System.out.println("##### visitInnerClass - " + obj);

	}

	@Override
	public void visitInnerClasses(InnerClasses obj) {
		System.out.println("##### visitInnerClasses - " + obj);

	}

	@Override
	public void visitJavaClass(JavaClass obj) {
		System.out.println("##### visitJavaClass - " + obj);

	}

	@Override
	public void visitLineNumber(LineNumber obj) {
		System.out.println("##### visitLineNumber - " + obj);

	}

	@Override
	public void visitLineNumberTable(LineNumberTable obj) {
		System.out.println("##### visitLineNumberTable - " + obj);

	}

	@Override
	public void visitLocalVariable(LocalVariable obj) {
		System.out.println("##### visitLocalVariable - " + obj);

	}

	@Override
	public void visitLocalVariableTable(LocalVariableTable obj) {
		System.out.println("##### visitLocalVariableTable - " + obj);

	}

	@Override
	public void visitMethod(Method obj) {
		System.out.println("##### visitMethod - " + obj);

	}

	@Override
	public void visitSignature(Signature obj) {
		System.out.println("##### visitSignature - " + obj);

	}

	@Override
	public void visitSourceFile(SourceFile obj) {
		System.out.println("##### visitSourceFile - " + obj);

	}

	@Override
	public void visitSynthetic(Synthetic obj) {
		System.out.println("##### visitSynthetic - " + obj);

	}

	@Override
	public void visitUnknown(Unknown obj) {
		System.out.println("##### visitUnknown - " + obj);

	}

	@Override
	public void visitStackMap(StackMap obj) {
		System.out.println("##### visitStackMap - " + obj);

	}

	@Override
	public void visitStackMapEntry(StackMapEntry obj) {
		System.out.println("##### visitStackMapEntry - " + obj);

	}

	@Override
	public void visitAnnotation(Annotations obj) {
		System.out.println("##### visitAnnotation - " + obj);

	}

	@Override
	public void visitParameterAnnotation(ParameterAnnotations obj) {
		System.out.println("##### visitParameterAnnotation - " + obj);

	}

	@Override
	public void visitAnnotationEntry(AnnotationEntry obj) {
		System.out.println("##### visitAnnotationEntry - " + obj);

	}

	@Override
	public void visitAnnotationDefault(AnnotationDefault obj) {
		System.out.println("##### visitAnnotationDefault - " + obj);

	}

	@Override
	public void visitLocalVariableTypeTable(LocalVariableTypeTable obj) {
		System.out.println("##### visitLocalVariableTypeTable - " + obj);

	}

	@Override
	public void visitEnclosingMethod(EnclosingMethod obj) {
		System.out.println("##### visitEnclosingMethod - " + obj);

	}

	@Override
	public void visitBootstrapMethods(BootstrapMethods obj) {
		System.out.println("##### visitBootstrapMethods - " + obj);

	}

	@Override
	public void visitMethodParameters(MethodParameters obj) {
		System.out.println("##### visitMethodParameters - " + obj);

	}

	@Override
	public void visitConstantMethodType(ConstantMethodType obj) {
		System.out.println("##### visitConstantMethodType - " + obj);

	}

	@Override
	public void visitConstantMethodHandle(ConstantMethodHandle obj) {
		System.out.println("##### visitConstantMethodHandle - " + obj);

	}

	@Override
	public void visitParameterAnnotationEntry(ParameterAnnotationEntry obj) {
		System.out.println("##### visitParameterAnnotationEntry - " + obj);

	}

	@Override
	public void visitConstantPackage(ConstantPackage constantPackage) {
		System.out.println("##### visitConstantPackage - " + constantPackage);

	}

	@Override
	public void visitConstantModule(ConstantModule constantModule) {
		System.out.println("##### ConstantModule - " + constantModule);

	}

}
