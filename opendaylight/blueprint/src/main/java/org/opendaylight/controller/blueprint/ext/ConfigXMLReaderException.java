/*
 * Copyright (c) 2017 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.blueprint.ext;

/**
 * Exception thrown by {@link DataStoreAppConfigDefaultXMLReader}.
 *
 * @author Michael Vorburger.ch
 */
public class ConfigXMLReaderException extends Exception {
    private static final long serialVersionUID = 1L;

    public ConfigXMLReaderException(final String message) {
        super(message);
    }

    public ConfigXMLReaderException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
