/*
 * Copyright 2015 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.maven;

import java.util.Properties;

public class BomConfig {

    private String artifactId;
    private String name;
    private String description = "Generated Bom";
    private ArtifactSet modules = new ArtifactSet();
    private ArtifactSet dependencies = new ArtifactSet();
    private GoalSet goals = new GoalSet();

    private Properties properties = new Properties();

    public BomConfig() {
    }

    public BomConfig(String artifactId, String name, String description) {
        this.artifactId = artifactId;
        this.name = name;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArtifactSet getModules() {
        return modules;
    }

    public ArtifactSet getDependencies() {
        return dependencies;
    }

    public GoalSet getGoals() {
        return goals;
    }

    public Properties getProperties() {
        return properties;
    }
}
