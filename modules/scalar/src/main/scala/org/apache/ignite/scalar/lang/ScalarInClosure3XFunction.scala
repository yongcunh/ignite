/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.scalar.lang

import org.apache.ignite.internal.util.lang.GridInClosure3X

/**
 * Wrapping Scala function for `GridInClosure3X`.
 */
class ScalarInClosure3XFunction[T1, T2, T3](val inner: GridInClosure3X[T1, T2, T3]) extends ((T1, T2, T3) => Unit) {
    assert(inner != null)

    /**
     * Delegates to passed in grid closure.
     */
    def apply(t1: T1, t2: T2, t3: T3) {
        inner.applyx(t1, t2, t3)
    }
}
