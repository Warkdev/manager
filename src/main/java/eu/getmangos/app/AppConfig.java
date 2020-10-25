/*
 * Copyright 2020 Warkdev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.getmangos.app;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.slf4j.Logger;

/**
 *
 * @author Warkdev
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ApplicationScoped
//@DeclareRoles({"ADMIN", "USER"})
public class AppConfig {

	@Inject private Logger logger;

	@Inject private FacesContext facesContext;

	@PostConstruct
	public void init() {
		logger.debug("Application init.");

		logger.debug("FacesContext Version: "+FacesContext.class.getPackage().getImplementationVersion());
	}

}
