/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.apache.ignite.portables;

import org.gridgain.grid.util.typedef.internal.*;

import java.sql.Timestamp;
import java.util.*;

/**
 * Defines configuration for GridGain portable functionality. All configuration
 * properties defined here can be overridden on per-type level in
 * {@link PortableTypeConfiguration}. Type configurations are provided via
 * {@link #getTypeConfigurations()} method.
 */
public class PortableConfiguration {
    /** Class names. */
    private Collection<String> clsNames;

    /** ID mapper. */
    private PortableIdMapper idMapper;

    /** Serializer. */
    private PortableSerializer serializer;

    /** Types. */
    private Collection<PortableTypeConfiguration> typeCfgs;

    /** Use timestamp flag. */
    private boolean useTs = true;

    /** Meta data enabled flag. */
    private boolean metaDataEnabled = true;

    /** Keep deserialized flag. */
    private boolean keepDeserialized = true;

    /**
     * Gets class names.
     *
     * @return Class names.
     */
    public Collection<String> getClassNames() {
        return clsNames;
    }

    /**
     * Sets class names.
     *
     * @param clsNames Class names.
     */
    public void setClassNames(Collection<String> clsNames) {
        this.clsNames = clsNames;
    }

    /**
     * Gets ID mapper.
     *
     * @return ID mapper.
     */
    public PortableIdMapper getIdMapper() {
        return idMapper;
    }

    /**
     * Sets ID mapper.
     *
     * @param idMapper ID mapper.
     */
    public void setIdMapper(PortableIdMapper idMapper) {
        this.idMapper = idMapper;
    }

    /**
     * Gets serializer.
     *
     * @return Serializer.
     */
    public PortableSerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets serializer.
     *
     * @param serializer Serializer.
     */
    public void setSerializer(PortableSerializer serializer) {
        this.serializer = serializer;
    }

    /**
     * Gets types configuration.
     *
     * @return Types configuration.
     */
    public Collection<PortableTypeConfiguration> getTypeConfigurations() {
        return typeCfgs;
    }

    /**
     * Sets type configurations.
     *
     * @param typeCfgs Type configurations.
     */
    public void setTypeConfigurations(Collection<PortableTypeConfiguration> typeCfgs) {
        this.typeCfgs = typeCfgs;
    }

    /**
     * If {@code true} then date values converted to {@link Timestamp} on deserialization.
     * <p>
     * Default value is {@code true}.
     *
     * @return Flag indicating whether date values converted to {@link Timestamp} during unmarshalling.
     */
    public boolean isUseTimestamp() {
        return useTs;
    }

    /**
     * @param useTs Flag indicating whether date values converted to {@link Timestamp} during unmarshalling.
     */
    public void setUseTimestamp(boolean useTs) {
        this.useTs = useTs;
    }

    /**
     * If {@code true}, meta data will be collected or all types. If you need to override this behaviour for
     * some specific type, use {@link PortableTypeConfiguration#setMetaDataEnabled(Boolean)} method.
     * <p>
     * Default value if {@code true}.
     *
     * @return Whether meta data is collected.
     */
    public boolean isMetaDataEnabled() {
        return metaDataEnabled;
    }

    /**
     * @param metaDataEnabled Whether meta data is collected.
     */
    public void setMetaDataEnabled(boolean metaDataEnabled) {
        this.metaDataEnabled = metaDataEnabled;
    }

    /**
     * If {@code true}, {@link PortableObject} will cache deserialized instance after
     * {@link PortableObject#deserialize()} is called. All consequent calls of this
     * method on the same instance of {@link PortableObject} will return that cached
     * value without actually deserializing portable object. If you need to override this
     * behaviour for some specific type, use {@link PortableTypeConfiguration#setKeepDeserialized(Boolean)}
     * method.
     * <p>
     * Default value if {@code true}.
     *
     * @return Whether deserialized value is kept.
     */
    public boolean isKeepDeserialized() {
        return keepDeserialized;
    }

    /**
     * @param keepDeserialized Whether deserialized value is kept.
     */
    public void setKeepDeserialized(boolean keepDeserialized) {
        this.keepDeserialized = keepDeserialized;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(PortableConfiguration.class, this);
    }
}
