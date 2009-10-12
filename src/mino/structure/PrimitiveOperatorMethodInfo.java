/* This file is part of Mino.
 *
 * See the NOTICE file distributed with this work for copyright information.
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

package mino.structure;

import java.util.*;

import mino.syntax.node.*;
import mino.walker.*;

public class PrimitiveOperatorMethodInfo
        extends MethodInfo {

    private final APrimitiveOperatorMember definition;

    private final Token operatorToken;

    PrimitiveOperatorMethodInfo(
            MethodTable methodTable,
            APrimitiveOperatorMember definition,
            List<TId> params,
            Token operatorToken) {

        super(methodTable, params);
        this.definition = definition;
        this.operatorToken = operatorToken;
    }

    @Override
    public String getName() {

        return this.operatorToken.getText();
    }

    @Override
    public void execute(
            InterpreterEngine interpreterEngine) {

        // TODO Auto-generated method stub

    }
}
