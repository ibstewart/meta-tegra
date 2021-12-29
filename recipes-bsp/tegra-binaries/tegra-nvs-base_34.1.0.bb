DESCRIPTION = "NVIDIA sensor HAL daemon"
L4T_DEB_COPYRIGHT_MD5 = "0a282b202b51eab090698fcda604cb76"
DEPENDS = "tegra-libraries-core"

L4T_DEB_TRANSLATED_BPN = "nvidia-l4t-init"
TEGRA_LIBRARIES_CONTAINER_CSV = ""

require tegra-debian-libraries-common.inc

<<<<<<<< HEAD:recipes-bsp/tegra-binaries/tegra-nvs-base_32.7.2.bb
MAINSUM = "44fa43d9646d66b5c1bb28def9736c3d8cf7a3e21082fbf9017c63246e2b0ae1"
MAINSUM:tegra210 = "a21c44851b287f0fde245f753fa7f591a2d84f125b111bbf54ae34d7c0f3b255"
========
MAINSUM = "aae9f9cf02fd0a0159f772b3582422164989131617a971df8ebdbff1339c59fd"
>>>>>>>> 390a51f3 (tegra-binaries: update for 34.1.0):recipes-bsp/tegra-binaries/tegra-nvs-base_34.1.0.bb

do_install() {
    install -d ${D}${sbindir}
    install -m 0755 ${S}/usr/sbin/nvs-service ${D}${sbindir}/
}

RDEPENDS:${PN} = "bash"
INSANE_SKIP:${PN} = "ldflags"