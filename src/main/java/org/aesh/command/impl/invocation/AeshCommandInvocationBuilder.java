/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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
package org.aesh.command.impl.invocation;

import org.aesh.command.CommandRuntime;
import org.aesh.command.Shell;
import org.aesh.command.invocation.CommandInvocation;
import org.aesh.command.invocation.CommandInvocationBuilder;
import org.aesh.command.invocation.CommandInvocationConfiguration;
import org.aesh.readline.Console;

/**
 * @author <a href="mailto:stale.pedersen@jboss.org">Ståle W. Pedersen</a>
 */
public class AeshCommandInvocationBuilder implements CommandInvocationBuilder<AeshCommandInvocation> {

    private final Shell shell;
    private final Console console;

    public AeshCommandInvocationBuilder(Shell shell, Console console) {
        this.shell = shell;
        this.console = console;
    }

    @Override
    public CommandInvocation build(CommandRuntime<AeshCommandInvocation> runtime,
            CommandInvocationConfiguration config) {
        return new AeshCommandInvocation(console, shell, runtime, config);
    }
}
