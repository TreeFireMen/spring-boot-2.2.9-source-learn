package com.hand.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/*
 * ognl: object graph navigation language  对象图形化导航语言
 *		它的强大之处在于他可以存取对象的任意属性,调用对象的方法
 *
 *
 *
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-07
 */
public class SpelTest {

	public static void main(String[] args) {
		/**
		 * 代码分析:
		 * 1. 创建解析器: spel使用ExpressionParser接口表示解析器,提供SpelExpressionParser默认实现
		 * 2. 解析表达式: 使用ExpressionParser的parseExpression解析相应的表达式为Expression对象
		 * 3. 构造上下文: 准备比如变量定义等等表达式需要的上下文数据
		 * 4. 求值: 通过Expression接口的getValue方法根据上下文获得表达式值
		 */
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("('Hello' + ' World').concat(#end)");
		EvaluationContext context = new StandardEvaluationContext();
		context.setVariable("end", "!");
		System.out.println(expression.getValue(context));
	}
}
