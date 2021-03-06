// PathVisioRPC : the XMLRPC interface for PathVisio,
// a tool for data visualization and analysis using Biological Pathways
// Copyright 2006-2014 BiGCaT Bioinformatics
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package org.pathvisio.xmlrpc;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.pathvisio.desktop.plugin.Plugin;

/**
 * Activator for plug in version of PathVisioRPC.
 * 
 * @author anwesha
 */
public class Activator implements BundleActivator {
	XmlRpcPlugin plugin = new XmlRpcPlugin();
	/**
	 * Starts the plugin in PathVisio
	 */
	@Override
	public void start(BundleContext context) throws Exception {

		context.registerService(Plugin.class.getName(), this.plugin, null);

	}

	/**
	 * Stops the plugin in PathVisio
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		this.plugin.done();
	}

}