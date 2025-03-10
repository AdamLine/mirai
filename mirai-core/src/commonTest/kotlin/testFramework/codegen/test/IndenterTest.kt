/*
 * Copyright 2019-2021 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/dev/LICENSE
 */

package net.mamoe.mirai.internal.testFramework.codegen.test

import net.mamoe.mirai.internal.test.AbstractTest
import net.mamoe.mirai.internal.testFramework.codegen.visitors.WordingIndenter
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class IndenterTest : AbstractTest() {

    @Test
    fun `can indentize`() {
        assertEquals("    test", WordingIndenter.spacing(4).indentize("test"))
    }
}