/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.rest.client.message;

import org.apache.ignite.portables.*;
import org.gridgain.grid.util.typedef.internal.*;

import java.util.*;

/**
 * Metadata response.
 */
public class GridClientMetaDataResponse implements PortableMarshalAware {
    /** */
    private Map<Integer, PortableMetadata> meta;

    /**
     * @param meta Portable objects metadata.
     */
    public void metaData(Map<Integer, PortableMetadata> meta) {
        this.meta = meta;
    }

    /** {@inheritDoc} */
    @Override public void writePortable(PortableWriter writer) throws PortableException {
        PortableRawWriter raw = writer.rawWriter();

        raw.writeMap(meta);
    }

    /** {@inheritDoc} */
    @Override public void readPortable(PortableReader reader) throws PortableException {
        PortableRawReader raw = reader.rawReader();

        meta = raw.readMap();
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(GridClientMetaDataResponse.class, this);
    }
}
