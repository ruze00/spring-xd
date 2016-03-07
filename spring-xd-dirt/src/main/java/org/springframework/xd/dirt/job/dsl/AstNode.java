/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.dirt.job.dsl;

/**
 * AST base class for AST nodes in a parsed Job specification.
 *
 * @author Andy Clement
 */
public abstract class AstNode {

	protected int startpos;

	protected int endpos;

	public AstNode(int startPos, int endPos) {
		this.startpos = startPos;
		this.endpos = endPos;
	}

	public int getStartPos() {
		return startpos;
	}

	public int getEndPos() {
		return endpos;
	}

	/**
	 * @return a string representation of the AST. Useful for debugging/testing.
	 */
	public abstract String stringify(boolean includePositionInfo);

	public String stringify() {
		return stringify(false);
	}

	// TODO pretty print the AST to a (possibly multiline) string
	public String format(int currentIndent) {
		return "";
	}

}
