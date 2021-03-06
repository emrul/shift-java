// Generated by ast.js
/**
 * Copyright 2018 Shape Security, Inc.
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


package com.shapesecurity.shift.es2018.ast;

import javax.annotation.Nonnull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class WhileStatement extends IterationStatement {
    @Nonnull
    public final Expression test;


    public WhileStatement (@Nonnull Expression test, @Nonnull Statement body) {
        super(body);
        this.test = test;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof WhileStatement && this.test.equals(((WhileStatement) object).test) && this.body.equals(((WhileStatement) object).body);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "WhileStatement");
        code = HashCodeBuilder.put(code, this.test);
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

}
