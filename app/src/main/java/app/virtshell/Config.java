/*
*************************************************************************
vShell - x86 Linux virtual shell application powered by QEMU.
Copyright (C) 2019-2021  Leonid Pliushch <leonid.pliushch@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*************************************************************************
*/
package app.virtshell;

import android.content.Context;

/**
 * Application build-time configuration entries.
 */
@SuppressWarnings("WeakerAccess")
public class Config {
    /**
     * Name of CD-ROM image file.
     * Must be a name of file located in assets directory.
     */
    public static final String CDROM_IMAGE_NAME = "operating-system.iso";

    /**
     * Name of HDD image file.
     * Must be a name of file located in assets directory.
     */
    public static final String HDD_IMAGE_NAME = "userdata.qcow2";

    /**
     * Name of zip archive with QEMU firmware.
     * Must be a name of file located in assets directory.
     */
    public static final String QEMU_DATA_PACKAGE = "qemu-runtime-data.bin";

    /**
     * Upstream DNS server used by QEMU DNS resolver.
     */
    public static final String QEMU_UPSTREAM_DNS = "1.1.1.1";

    /**
     * Minimal RAM allocation in MiB which guarantees that guest OS will
     * boot and work properly.
     */
    public static final int QEMU_MIN_SAFE_RAM = 256;

    /**
     * Max RAM allocation in MiB which is considered to be safe.
     * Using 2047 MiB since this is max supported value of bundled
     * 32 bit variants of QEMU (used on armv7l and i686 devices).
     */
    public static final int QEMU_MAX_SAFE_RAM = 2047;

    /**
     * Minimal size of TCG buffer in MiB that would not cause too many
     * flushes of generated code cache and significant performance
     * degradation.
     */
    public static final int QEMU_MIN_TCG_BUF = 64;

    /**
     * Maximal size in MiB of TCG buffer to prevent wasting of device
     * memory by keeping unnecessary code caches.
     */
    public static final int QEMU_MAX_TCG_BUF = 512;

    /**
     * A tag used for general logging.
     */
    public static final String APP_LOG_TAG = "virt-shell:app";

    /**
     * A tag used for input (ime) logging.
     */
    public static final String INPUT_LOG_TAG = "virt-shell:input";

    /**
     * A tag used for installer logging.
     */
    public static final String INSTALLER_LOG_TAG = "virt-shell:installer";

    /**
     * A tag used for wakelock logging.
     */
    public static final String WAKELOCK_LOG_TAG = "virt-shell:wakelock";

    /**
     * Returns path to runtime environment directory.
     */
    public static String getDataDirectory(final Context context) {
        return context.getFilesDir().getAbsolutePath();
    }
}
