/*
 * Copyright 2014 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.minifier;

import com.shapesecurity.shift.ast.Block;
import com.shapesecurity.shift.ast.CatchClause;
import com.shapesecurity.shift.ast.Directive;
import com.shapesecurity.shift.ast.Expression;
import com.shapesecurity.shift.ast.FunctionBody;
import com.shapesecurity.shift.ast.Identifier;
import com.shapesecurity.shift.ast.Script;
import com.shapesecurity.shift.ast.Statement;
import com.shapesecurity.shift.ast.SwitchCase;
import com.shapesecurity.shift.ast.SwitchDefault;
import com.shapesecurity.shift.ast.VariableDeclaration;
import com.shapesecurity.shift.ast.VariableDeclarator;
import com.shapesecurity.shift.ast.directive.UnknownDirective;
import com.shapesecurity.shift.ast.directive.UseStrictDirective;
import com.shapesecurity.shift.ast.expression.ArrayExpression;
import com.shapesecurity.shift.ast.expression.BinaryExpression;
import com.shapesecurity.shift.ast.expression.CallExpression;
import com.shapesecurity.shift.ast.expression.ComputedMemberExpression;
import com.shapesecurity.shift.ast.expression.ConditionalExpression;
import com.shapesecurity.shift.ast.expression.FunctionExpression;
import com.shapesecurity.shift.ast.expression.IdentifierExpression;
import com.shapesecurity.shift.ast.expression.LiteralBooleanExpression;
import com.shapesecurity.shift.ast.expression.LiteralNullExpression;
import com.shapesecurity.shift.ast.expression.LiteralNumericExpression;
import com.shapesecurity.shift.ast.expression.LiteralRegExpExpression;
import com.shapesecurity.shift.ast.expression.LiteralStringExpression;
import com.shapesecurity.shift.ast.expression.NewExpression;
import com.shapesecurity.shift.ast.expression.ObjectExpression;
import com.shapesecurity.shift.ast.expression.PostfixExpression;
import com.shapesecurity.shift.ast.expression.PrefixExpression;
import com.shapesecurity.shift.ast.expression.StaticMemberExpression;
import com.shapesecurity.shift.ast.expression.ThisExpression;
import com.shapesecurity.shift.ast.property.DataProperty;
import com.shapesecurity.shift.ast.property.Getter;
import com.shapesecurity.shift.ast.property.ObjectProperty;
import com.shapesecurity.shift.ast.property.PropertyName;
import com.shapesecurity.shift.ast.property.Setter;
import com.shapesecurity.shift.ast.statement.BlockStatement;
import com.shapesecurity.shift.ast.statement.BreakStatement;
import com.shapesecurity.shift.ast.statement.ContinueStatement;
import com.shapesecurity.shift.ast.statement.DebuggerStatement;
import com.shapesecurity.shift.ast.statement.DoWhileStatement;
import com.shapesecurity.shift.ast.statement.EmptyStatement;
import com.shapesecurity.shift.ast.statement.ExpressionStatement;
import com.shapesecurity.shift.ast.statement.ForInStatement;
import com.shapesecurity.shift.ast.statement.ForStatement;
import com.shapesecurity.shift.ast.statement.FunctionDeclaration;
import com.shapesecurity.shift.ast.statement.IfStatement;
import com.shapesecurity.shift.ast.statement.LabeledStatement;
import com.shapesecurity.shift.ast.statement.ReturnStatement;
import com.shapesecurity.shift.ast.statement.SwitchStatement;
import com.shapesecurity.shift.ast.statement.SwitchStatementWithDefault;
import com.shapesecurity.shift.ast.statement.ThrowStatement;
import com.shapesecurity.shift.ast.statement.TryCatchStatement;
import com.shapesecurity.shift.ast.statement.TryFinallyStatement;
import com.shapesecurity.shift.ast.statement.VariableDeclarationStatement;
import com.shapesecurity.shift.ast.statement.WhileStatement;
import com.shapesecurity.shift.ast.statement.WithStatement;
import com.shapesecurity.shift.visitor.DirtyState;

import org.jetbrains.annotations.NotNull;

public class ComposedRule<T extends MinificationRule> extends MinificationRule {
  @NotNull
  private final T[] rules;

  public ComposedRule(@NotNull T[] rules) {
    super();
    this.rules = rules;
  }

  @NotNull
  private DirtyState<Statement> t(@NotNull Statement node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Statement> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<Directive> t(@NotNull Directive node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Directive> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<Expression> t(@NotNull Expression node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Expression> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<PropertyName> t(@NotNull PropertyName node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<PropertyName> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<ObjectProperty> t(@NotNull ObjectProperty node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<ObjectProperty> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<SwitchCase> t(@NotNull SwitchCase node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<SwitchCase> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  private DirtyState<SwitchDefault> t(@NotNull SwitchDefault node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<SwitchDefault> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<CatchClause> transform(@NotNull CatchClause node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<CatchClause> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<Block> transform(@NotNull Block node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Block> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<VariableDeclarator> transform(@NotNull VariableDeclarator node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<VariableDeclarator> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<Directive> transform(@NotNull UnknownDirective node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Directive> transform(@NotNull UseStrictDirective node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull ArrayExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull BinaryExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull CallExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull ComputedMemberExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull ConditionalExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull FunctionExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull IdentifierExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull LiteralBooleanExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull LiteralNullExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull LiteralNumericExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull LiteralRegExpExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull LiteralStringExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull NewExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull ObjectExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull PostfixExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull PrefixExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull StaticMemberExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Expression> transform(@NotNull ThisExpression node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Identifier> transform(@NotNull Identifier node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Identifier> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<FunctionBody> transform(@NotNull FunctionBody node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<FunctionBody> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<Script> transform(@NotNull Script node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<Script> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }

  @NotNull
  @Override
  public DirtyState<PropertyName> transform(@NotNull PropertyName node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<ObjectProperty> transform(@NotNull Getter node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<ObjectProperty> transform(@NotNull DataProperty node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<ObjectProperty> transform(@NotNull Setter node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull BlockStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull BreakStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ContinueStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull DebuggerStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull DoWhileStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull EmptyStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ExpressionStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ForInStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ForStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull FunctionDeclaration node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull IfStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull LabeledStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ReturnStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull SwitchStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull SwitchStatementWithDefault node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull ThrowStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull TryCatchStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull VariableDeclarationStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull WhileStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull WithStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<SwitchCase> transform(@NotNull SwitchCase node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<SwitchDefault> transform(@NotNull SwitchDefault node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<Statement> transform(@NotNull TryFinallyStatement node) {
    return t(node);
  }

  @NotNull
  @Override
  public DirtyState<VariableDeclaration> transform(@NotNull VariableDeclaration node) {
    boolean dirty = false;
    for (T rule : this.rules) {
      DirtyState<VariableDeclaration> transform = node.transform(rule);
      dirty = dirty || transform.dirty;
      node = transform.node;
    }
    return new DirtyState<>(node, dirty);
  }
}
