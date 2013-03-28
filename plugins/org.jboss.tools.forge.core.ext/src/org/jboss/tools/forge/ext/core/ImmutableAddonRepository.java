/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.tools.forge.ext.core;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.jboss.forge.container.addons.AddonId;
import org.jboss.forge.container.repositories.AddonDependencyEntry;
import org.jboss.forge.container.repositories.AddonRepository;

/**
 * An immutable {@link AddonRepository} implementation.
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 *
 */
public class ImmutableAddonRepository implements AddonRepository {
    private AddonRepository delegate;

    public ImmutableAddonRepository(AddonRepository delegate) {
        this.delegate = delegate;
    }

    @Override
    public File getAddonBaseDir(AddonId addonId) {
        return delegate.getAddonBaseDir(addonId);
    }

    @Override
    public Set<AddonDependencyEntry> getAddonDependencies(AddonId addonId) {
        return delegate.getAddonDependencies(addonId);
    }

    @Override
    public File getAddonDescriptor(AddonId addonId) {
        return delegate.getAddonDescriptor(addonId);
    }

    @Override
    public List<File> getAddonResources(AddonId addonId) {
        return delegate.getAddonResources(addonId);
    }

    @Override
    public File getRootDirectory() {
        return delegate.getRootDirectory();
    }

    @Override
    public boolean isDeployed(AddonId addonId) {
        return delegate.isDeployed(addonId);
    }

    @Override
    public boolean isEnabled(AddonId addonId) {
        return delegate.isEnabled(addonId);
    }

    @Override
    public List<AddonId> listEnabled() {
        return delegate.listEnabled();
    }

    @Override
    public List<AddonId> listEnabledCompatibleWithVersion(String version) {
        return delegate.listEnabledCompatibleWithVersion(version);
    }

}