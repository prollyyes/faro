#!/usr/bin/env bash
# Download Faro font files from Google Fonts.
# Run from the repo root: bash scripts/download_fonts.sh
# Requires curl.

set -euo pipefail
FONT_DIR="app/src/main/res/font"
mkdir -p "$FONT_DIR"

# EB Garamond — Display L and Display M (user-confirmed)
BASE_EB="https://github.com/googlefonts/EBGaramond/raw/main/fonts/ttf"
curl -fsSL "${BASE_EB}/EBGaramond-Regular.ttf"  -o "${FONT_DIR}/eb_garamond_regular.ttf"
curl -fsSL "${BASE_EB}/EBGaramond-Medium.ttf"   -o "${FONT_DIR}/eb_garamond_medium.ttf"
curl -fsSL "${BASE_EB}/EBGaramond-SemiBold.ttf" -o "${FONT_DIR}/eb_garamond_semibold.ttf"
curl -fsSL "${BASE_EB}/EBGaramond-Bold.ttf"     -o "${FONT_DIR}/eb_garamond_bold.ttf"

# Hanken Grotesk — UI / body text
BASE_HK="https://github.com/marcologous/Hanken-Grotesk/raw/master/fonts/ttf"
curl -fsSL "${BASE_HK}/HankenGrotesk-Regular.ttf"  -o "${FONT_DIR}/hanken_grotesk_regular.ttf"
curl -fsSL "${BASE_HK}/HankenGrotesk-Medium.ttf"   -o "${FONT_DIR}/hanken_grotesk_medium.ttf"
curl -fsSL "${BASE_HK}/HankenGrotesk-SemiBold.ttf" -o "${FONT_DIR}/hanken_grotesk_semibold.ttf"
curl -fsSL "${BASE_HK}/HankenGrotesk-Bold.ttf"     -o "${FONT_DIR}/hanken_grotesk_bold.ttf"

echo "Fonts downloaded to ${FONT_DIR}/"
