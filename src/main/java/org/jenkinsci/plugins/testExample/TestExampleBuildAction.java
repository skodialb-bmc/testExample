package org.jenkinsci.plugins.testExample;

import hudson.model.AbstractBuild;
import hudson.model.Action;

/**
 * Created by prit8976 on 8/27/15.
 */
public class TestExampleBuildAction implements Action {

    private String message;
    private AbstractBuild<?, ?> build;

    @Override
    public String getIconFileName() {
        return "/plugin/testExample/img/build-goals.png";
    }

    @Override
    public String getDisplayName() {
        return "Test Example Build Page";
    }

    @Override
    public String getUrlName() {
        return "testExampleBA";
    }

    public String getMessage() {
        return this.message;
    }

    public int getBuildNumber() {
        return this.build.number;
    }

    public AbstractBuild<?, ?> getBuild() {
        return build;
    }

    TestExampleBuildAction(final String message, final AbstractBuild<?, ?> build)
    {
        this.message = message;
        this.build = build;
    }
}
