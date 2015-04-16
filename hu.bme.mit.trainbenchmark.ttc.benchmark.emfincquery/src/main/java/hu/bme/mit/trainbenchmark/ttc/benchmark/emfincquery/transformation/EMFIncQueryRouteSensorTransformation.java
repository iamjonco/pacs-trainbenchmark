/*******************************************************************************
 * Copyright (c) 2010-2015, Gabor Szarnyas, Benedek Izso, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Benedek Izso - initial API and implementation
 *   Gabor Szarnyas - initial API and implementation
 *******************************************************************************/
package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.transformation;

import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.RouteSensorMatch;

import java.util.Collection;

public class EMFIncQueryRouteSensorTransformation extends EMFIncQueryTransformationAction {

	@Override
	public void transform(final Collection<Object> matches) {
		for (final Object match : matches) {
			final RouteSensorMatch rsm = (RouteSensorMatch) match;
			rsm.getRoute().getDefinedBy().add(rsm.getSensor());
		}
	}

}
